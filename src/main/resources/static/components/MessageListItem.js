import lifecycleLogger from '../mixins/lifecycle-logger.mixin.js';
export default {
    name: 'messageListItem',
    template: `<li>{{item.text}} - {{ Date.parse(item.createdDate) | datetime('MM/DD/YYYY')}}
    <button @click="deleteClicked">X</button></li>`,
    mixins: [lifecycleLogger],
    props: {
        item: {
            type: Object,
            required: true
        }
    },
    methods: {
        deleteClicked() {
            this.$emit('delete');
        }
    }
}